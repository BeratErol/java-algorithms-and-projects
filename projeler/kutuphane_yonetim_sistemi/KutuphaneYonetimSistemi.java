import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/* =======================
   MODEL
   ======================= */
class Book {
    private int id;
    private String title;
    private String author;
    private String category;
    private boolean borrowed;
    private String borrower;
    private LocalDate borrowDate;
    private LocalDate dueDate;

    public Book(int id, String title, String author, String category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.borrowed = false;
    }

    // Getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getCategory() { return category; }
    public boolean isBorrowed() { return borrowed; }
    public String getBorrower() { return borrower; }
    public LocalDate getBorrowDate() { return borrowDate; }
    public LocalDate getDueDate() { return dueDate; }

    public void borrow(String borrowerName) {
        borrowed = true;
        borrower = borrowerName;
        borrowDate = LocalDate.now();
        dueDate = borrowDate.plusDays(14); // 2 hafta ödünç süresi
    }

    public void returnBook() {
        borrowed = false;
        borrower = null;
        borrowDate = null;
        dueDate = null;
    }

    public String getStatus() {
        return borrowed ? "Ödünç Alındı" : "Rafta";
    }

    public boolean isOverdue() {
        return borrowed && LocalDate.now().isAfter(dueDate);
    }
    
 // Test amaçlı tarihi geçmişe çekme metodu
    public void forceOverdue(String borrowerName, int daysAgo) {
        this.borrowed = true;
        this.borrower = borrowerName;
        this.borrowDate = LocalDate.now().minusDays(daysAgo + 14);
        this.dueDate = LocalDate.now().minusDays(daysAgo); // İade tarihi geçmişte kaldı
    } 
}

/* =======================
   YÖNETİCİ
   ======================= */
class LibraryManager {
    private List<Book> books = new ArrayList<>();
    private int counter = 1;

    public LibraryManager() {
        // Varsayılan kitaplar
        addBook("Suç ve Ceza", "Fyodor Dostoyevski", "Klasik");
        addBook("1984", "George Orwell", "Distopya");
        addBook("Kürk Mantolu Madonna", "Sabahattin Ali", "Roman");
        addBook("Sefiller", "Victor Hugo", "Klasik");
        addBook("Simyacı", "Paulo Coelho", "Felsefe");
        addBook("Tutunamayanlar", "Oğuz Atay", "Roman");
        addBook("Beyaz Diş", "Jack London", "Macera");
        addBook("Hayvan Çiftliği", "George Orwell", "Siyasi Alegori");
        addBook("Dönüşüm", "Franz Kafka", "Varoluş");
        addBook("Yeraltından Notlar", "Fyodor Dostoyevski", "Psikoloji");
        addBook("Fareler ve İnsanlar", "John Steinbeck", "Roman");
        addBook("Kumarbaz", "Fyodor Dostoyevski", "Psikoloji");
        addBook("Martin Eden", "Jack London", "Roman");
        addBook("Uçurtma Avcısı", "Khaled Hosseini", "Dram");
        addBook("Saatleri Ayarlama Enstitüsü", "Ahmet Hamdi Tanpınar", "Modern");
        addBook("İnsan Ne ile Yaşar", "Lev Tolstoy", "Felsefe");
        addBook("Beyaz Gemi", "Cengiz Aytmatov", "Roman");
        addBook("Körlük", "Jose Saramago", "Distopya");
        addBook("Yabancı", "Albert Camus", "Felsefe");
        addBook("Anna Karenina", "Lev Tolstoy", "Klasik");
        addBook("Suç ve Ceza - 2", "Fyodor Dostoyevski", "Klasik");
        addBook("İnce Memed", "Yaşar Kemal", "Roman");
        addBook("Ben Robot", "Isaac Asimov", "Bilim Kurgu");
        addBook("Cesur Yeni Dünya", "Aldous Huxley", "Distopya");
        addBook("Vadideki Zambak", "Balzac", "Klasik");
        addBook("Karamazov Kardeşler", "Fyodor Dostoyevski", "Klasik");
        
        // Başlangıçta 5 kitap ödünç verilmiş olsun
        books.get(0).borrow("Ali Yılmaz");
        books.get(2).borrow("Ayşe Demir");
        books.get(5).forceOverdue("Mehmet Kaya", 5);
        books.get(8).borrow("Zeynep Arslan");
        books.get(12).borrow("Can Özkan"); 
    }
 
    public boolean addBook(String title, String author, String category) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title))
                return false;
        }
        books.add(new Book(counter++, title, author, category));
        return true;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Book> searchBooks(String query) {
        List<Book> results = new ArrayList<>();
        String q = query.toLowerCase();
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(q) ||
                b.getAuthor().toLowerCase().contains(q) ||
                b.getCategory().toLowerCase().contains(q)) {
                results.add(b);
            }
        }
        return results;
    }

    public List<Book> getBorrowedBooks() {
        List<Book> borrowed = new ArrayList<>();
        for (Book b : books) {
            if (b.isBorrowed()) borrowed.add(b);
        }
        return borrowed;
    }

    public List<Book> getOverdueBooks() {
        List<Book> overdue = new ArrayList<>();
        for (Book b : books) {
            if (b.isOverdue()) overdue.add(b);
        }
        return overdue;
    }

    public boolean borrowBook(int id, String borrower) {
        for (Book b : books) {
            if (b.getId() == id && !b.isBorrowed()) {
                b.borrow(borrower);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(int id) {
        for (Book b : books) {
            if (b.getId() == id && b.isBorrowed()) {
                b.returnBook();
                return true;
            }
        }
        return false;
    }

    public Book getBookById(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }

    public Map<String, Integer> getCategoryStats() {
        Map<String, Integer> stats = new HashMap<>();
        for (Book b : books) {
            stats.put(b.getCategory(), stats.getOrDefault(b.getCategory(), 0) + 1);
        }
        return stats;
    }
}

/* =======================
   MODERN GUI
   ======================= */
class ModernLibraryGUI extends JFrame {
    private LibraryManager manager;
    private JTable bookTable;
    private DefaultTableModel tableModel;
    private JTextField searchField;
    private JLabel statsLabel;
    
    // Modern renkler
    private final Color PRIMARY = new Color(41, 128, 185);
    private final Color SUCCESS = new Color(39, 174, 96);
    private final Color DANGER = new Color(231, 76, 60);
    private final Color WARNING = new Color(243, 156, 18);
    private final Color DARK = new Color(44, 62, 80);
    private final Color LIGHT = new Color(236, 240, 241);

    public ModernLibraryGUI(LibraryManager manager) {
        this.manager = manager;
        
        setTitle("Modern Kütüphane Yönetim Sistemi");
        setSize(1200, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // Ana panel
        JPanel mainPanel = new JPanel(new BorderLayout(15, 15));
        mainPanel.setBackground(LIGHT);
        mainPanel.setBorder(new EmptyBorder(15, 15, 15, 15));
        
        // Üst panel - Başlık ve arama
        mainPanel.add(createTopPanel(), BorderLayout.NORTH);
        
        // Sol panel - İşlemler
        mainPanel.add(createSidePanel(), BorderLayout.WEST);
        
        // Merkez panel - Tablo
        mainPanel.add(createTablePanel(), BorderLayout.CENTER);
        
        // Alt panel - İstatistikler
        mainPanel.add(createStatsPanel(), BorderLayout.SOUTH);
        
        add(mainPanel);
        updateTable(manager.getBooks());
        updateStats();
    }

    private JPanel createTopPanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBackground(LIGHT);
        
        // Başlık
        JLabel title = new JLabel("KÜTÜPHANE YÖNETİM SİSTEMİ");
        title.setFont(new Font("Segoe UI", Font.BOLD, 28));
        title.setForeground(DARK);
        
        // Arama paneli
        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        searchPanel.setBackground(LIGHT);
        
        searchField = new JTextField(25);
        searchField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        searchField.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(PRIMARY, 2, true),
            new EmptyBorder(8, 12, 8, 12)
        ));
        
        JButton searchBtn = createStyledButton("Ara", PRIMARY);
        searchBtn.addActionListener(e -> performSearch());
        
        JButton clearBtn = createStyledButton("Tümünü Göster", DARK);
        clearBtn.addActionListener(e -> {
            searchField.setText("");
            updateTable(manager.getBooks());
        });
        
        searchPanel.add(new JLabel("Arama: "));
        searchPanel.add(searchField);
        searchPanel.add(searchBtn);
        searchPanel.add(clearBtn);
        
        panel.add(title, BorderLayout.WEST);
        panel.add(searchPanel, BorderLayout.EAST);
        
        return panel;
    }

    private JPanel createSidePanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.WHITE);
        panel.setBorder(new EmptyBorder(15, 15, 15, 15));
        panel.setPreferredSize(new Dimension(250, 0));
        
        JLabel menuTitle = new JLabel("İŞLEMLER");
        menuTitle.setFont(new Font("Segoe UI", Font.BOLD, 16));
        menuTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(menuTitle);
        panel.add(Box.createVerticalStrut(20));
        
        // Butonlar
        JButton btnAdd = createMenuButton("Yeni Kitap Ekle +", SUCCESS);
        btnAdd.addActionListener(e -> addBook());
        
        JButton btnBorrow = createMenuButton("Ödünç Ver >>", PRIMARY);
        btnBorrow.addActionListener(e -> borrowBook());
        
        JButton btnReturn = createMenuButton("İade Al <<", SUCCESS);
        btnReturn.addActionListener(e -> returnBook());
        
        JButton btnBorrowed = createMenuButton("Ödünç Listesi =", WARNING);
        btnBorrowed.addActionListener(e -> updateTable(manager.getBorrowedBooks()));
        
        JButton btnOverdue = createMenuButton("Gecikmiş Kitaplar !", DANGER);
        btnOverdue.addActionListener(e -> showOverdueBooks());
        
        JButton btnStats = createMenuButton("İstatistikler #", PRIMARY);
        btnStats.addActionListener(e -> showStatistics());
        
        JButton btnRefresh = createMenuButton("Yenile @", DARK);
        btnRefresh.addActionListener(e -> {
            updateTable(manager.getBooks());
            updateStats();
        });
        
        panel.add(btnAdd);
        panel.add(Box.createVerticalStrut(10));
        panel.add(btnBorrow);
        panel.add(Box.createVerticalStrut(10));
        panel.add(btnReturn);
        panel.add(Box.createVerticalStrut(10));
        panel.add(btnBorrowed);
        panel.add(Box.createVerticalStrut(10));
        panel.add(btnOverdue);
        panel.add(Box.createVerticalStrut(10));
        panel.add(btnStats);
        panel.add(Box.createVerticalStrut(10));
        panel.add(btnRefresh);
        
        return panel;
    }

    private JPanel createTablePanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(Color.WHITE);

        String[] columns = {
            "ID", "Kitap Adı", "Yazar", "Kategori",
            "Durum", "Ödünç Alan", "İade Tarihi"
        };

        tableModel = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) { return false; }
        };

        bookTable = new JTable(tableModel);

        // ================== OKUNABİLİRLİK AYARLARI ==================
        bookTable.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        bookTable.setRowHeight(40); // Satır yüksekliğini artırarak metinlere yer açıyoruz
        bookTable.setIntercellSpacing(new Dimension(10, 5)); // Hücreler arası boşluk
        bookTable.setSelectionBackground(new Color(52, 152, 219, 40));
        bookTable.setGridColor(new Color(230, 230, 230));

        // ================== ÖZEL HÜCRE TASARIMI (PADDING) ==================
        // Yazıların kenara yapışmasını engelleyen özel bir Renderer
        DefaultTableCellRenderer paddedRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, 
                    boolean isSelected, boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10)); // Soldan ve sağdan 10px boşluk
                
                // Durum Sütunu (4. Sütun) için Renklendirme
                if (column == 4) {
                    if ("Rafta".equals(value)) {
                        setForeground(new Color(39, 174, 96)); // Yeşil
                        setFont(getFont().deriveFont(Font.BOLD));
                    } else {
                        setForeground(new Color(192, 57, 43)); // Kırmızı
                        setFont(getFont().deriveFont(Font.BOLD));
                    }
                } else {
                    setForeground(Color.BLACK);
                    setFont(getFont().deriveFont(Font.PLAIN));
                }
                return this;
            }
        };

        // Tüm sütunlara bu boşluklu tasarımı uygula
        for (int i = 0; i < bookTable.getColumnCount(); i++) {
            bookTable.getColumnModel().getColumn(i).setCellRenderer(paddedRenderer);
        }

        // ================== SÜTUN GENİŞLİKLERİ ==================
        bookTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        bookTable.getColumnModel().getColumn(0).setPreferredWidth(60);  // ID
        bookTable.getColumnModel().getColumn(1).setPreferredWidth(250); // Kitap Adı
        bookTable.getColumnModel().getColumn(2).setPreferredWidth(180); // Yazar
        bookTable.getColumnModel().getColumn(3).setPreferredWidth(100); // Kategori
        bookTable.getColumnModel().getColumn(4).setPreferredWidth(110); // Durum
        bookTable.getColumnModel().getColumn(5).setPreferredWidth(150); // Ödünç Alan
        bookTable.getColumnModel().getColumn(6).setPreferredWidth(100); // Tarih

        JScrollPane scrollPane = new JScrollPane(bookTable);
        scrollPane.setBorder(new EmptyBorder(0,0,0,0)); // Dış çerçeveyi temizle
        panel.add(scrollPane, BorderLayout.CENTER);
        
        return panel;
    } 

    private JPanel createStatsPanel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.setBackground(DARK);
        panel.setBorder(new EmptyBorder(10, 15, 10, 15));
        
        statsLabel = new JLabel();
        statsLabel.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        statsLabel.setForeground(Color.WHITE);
        
        panel.add(statsLabel);
        
        return panel;
    }

    private void updateTable(List<Book> books) {
        tableModel.setRowCount(0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        for (Book book : books) {
            Object[] row = {
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getCategory(),
                book.getStatus(),
                book.isBorrowed() ? book.getBorrower() : "-",
                book.isBorrowed() ? book.getDueDate().format(formatter) : "-"
            };
            tableModel.addRow(row);
        }
    }

    private void updateStats() {
        int total = manager.getBooks().size();
        int borrowed = manager.getBorrowedBooks().size();
        int available = total - borrowed;
        int overdue = manager.getOverdueBooks().size();
        
        statsLabel.setText(String.format(
            "Toplam: %d  |  Rafta: %d  |  Ödünçte: %d  |  Gecikmiş: %d",
            total, available, borrowed, overdue
        ));
    }

    private void performSearch() {
        String query = searchField.getText().trim();
        if (query.isEmpty()) {
            updateTable(manager.getBooks());
        } else {
            updateTable(manager.searchBooks(query));
        }
    }

    private void addBook() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        
        JTextField titleField = new JTextField();
        JTextField authorField = new JTextField();
        JTextField categoryField = new JTextField();
        
        panel.add(new JLabel("Kitap Adı:"));
        panel.add(titleField);
        panel.add(new JLabel("Yazar:"));
        panel.add(authorField);
        panel.add(new JLabel("Kategori:"));
        panel.add(categoryField);
        
        int result = JOptionPane.showConfirmDialog(this, panel, 
            "Yeni Kitap Ekle", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        if (result == JOptionPane.OK_OPTION) {
            String title = titleField.getText().trim();
            String author = authorField.getText().trim();
            String category = categoryField.getText().trim();
            
            if (!title.isEmpty() && !author.isEmpty() && !category.isEmpty()) {
                if (manager.addBook(title, author, category)) {
                    showMessage("Başarılı!", "Kitap başarıyla eklendi: " + title, SUCCESS);
                    updateTable(manager.getBooks());
                    updateStats();
                } else {
                    showMessage("Hata!", "Bu kitap zaten mevcut!", DANGER);
                }
            } else {
                showMessage("Uyarı!", "Lütfen tüm alanları doldurun!", WARNING);
            }
        }
    }

    private void borrowBook() {
        int selectedRow = bookTable.getSelectedRow();
        if (selectedRow == -1) {
            showMessage("Uyarı!", "Lütfen bir kitap seçin!", WARNING);
            return;
        }
        
        int bookId = (int) tableModel.getValueAt(selectedRow, 0);
        Book book = manager.getBookById(bookId);
        
        if (book.isBorrowed()) {
            showMessage("Hata!", "Bu kitap zaten ödünç alınmış!", DANGER);
            return;
        }
        
        String borrower = JOptionPane.showInputDialog(this, 
            "Ödünç alan kişinin adı:", "Ödünç Ver", JOptionPane.PLAIN_MESSAGE);
        
        if (borrower != null && !borrower.trim().isEmpty()) {
            manager.borrowBook(bookId, borrower.trim());
            showMessage("Başarılı!", "Kitap ödünç verildi: " + book.getTitle(), SUCCESS);
            updateTable(manager.getBooks());
            updateStats();
        }
    }

    private void returnBook() {
        int selectedRow = bookTable.getSelectedRow();
        if (selectedRow == -1) {
            showMessage("Uyarı!", "Lütfen bir kitap seçin!", WARNING);
            return;
        }
        
        int bookId = (int) tableModel.getValueAt(selectedRow, 0);
        Book book = manager.getBookById(bookId);
        
        if (!book.isBorrowed()) {
            showMessage("Hata!", "Bu kitap zaten rafta!", DANGER);
            return;
        }
        
        manager.returnBook(bookId);
        showMessage("Başarılı!", "Kitap iade alındı: " + book.getTitle(), SUCCESS);
        updateTable(manager.getBooks());
        updateStats();
    }

    private void showOverdueBooks() {
        List<Book> overdue = manager.getOverdueBooks();
        if (overdue.isEmpty()) {
            showMessage("Bilgi", "Gecikmiş kitap bulunmuyor!", PRIMARY);
        } else {
            updateTable(overdue);
        }
    }

    private void showStatistics() {
        Map<String, Integer> stats = manager.getCategoryStats();
        StringBuilder sb = new StringBuilder("KATEGORİ İSTATİSTİKLERİ\n\n");
        
        for (Map.Entry<String, Integer> entry : stats.entrySet()) {
            sb.append(String.format("%-15s: %d kitap\n", entry.getKey(), entry.getValue()));
        }
        
        JTextArea textArea = new JTextArea(sb.toString());
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        textArea.setEditable(false);
        
        JOptionPane.showMessageDialog(this, new JScrollPane(textArea), 
            "İstatistikler", JOptionPane.INFORMATION_MESSAGE);
    }

    private JButton createStyledButton(String text, Color color) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 13));
        btn.setBackground(color);
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setPreferredSize(new Dimension(120, 35));
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btn.setBackground(color.darker());
            }
            public void mouseExited(MouseEvent e) {
                btn.setBackground(color);
            }
        });
        
        return btn;
    }

    private JButton createMenuButton(String text, Color color) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btn.setBackground(color);
        btn.setForeground(Color.WHITE);
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn.setMaximumSize(new Dimension(220, 45));
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        btn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                btn.setBackground(color.darker());
            }
            public void mouseExited(MouseEvent e) {
                btn.setBackground(color);
            }
        });
        
        return btn;
    }

    private void showMessage(String title, String message, Color color) {
        JLabel label = new JLabel(message);
        label.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        label.setBorder(new EmptyBorder(10, 10, 10, 10));
        
        JOptionPane.showMessageDialog(this, label, title, JOptionPane.PLAIN_MESSAGE);
    }
}

/* =======================
   MAIN
   ======================= */
public class KutuphaneYonetimSistemi {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        SwingUtilities.invokeLater(() -> {
            ModernLibraryGUI gui = new ModernLibraryGUI(new LibraryManager());
            gui.setVisible(true);
        });
    }
} 