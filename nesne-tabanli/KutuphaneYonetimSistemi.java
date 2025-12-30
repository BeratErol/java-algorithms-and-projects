import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

// KullanÄ±cÄ± sÄ±nÄ±fÄ±
class User {
    private String username;
    private String password;
    private String userType; // Ã¶ÄŸrenci, Ã¶ÄŸretmen, dÄ±ÅŸ Ã¼ye

    // constructor, getters, setters
}

// Kitap sÄ±nÄ±fÄ±
class Book {
    private String title;
    private String author;
    private int year;
    private String isbn;
    private String status; // Ã¶dÃ¼nÃ§ alÄ±ndÄ±, rafta, rezerve edildi

    // constructor, getters, setters
}

// KÃ¼tÃ¼phane YÃ¶neticisi sÄ±nÄ±fÄ±
class LibraryManager {
    private List<User> users;
    private List<Book> books;

    public LibraryManager() {
        users = new ArrayList<>();
        books = new ArrayList<>();
    }

    public void loadUsersFromExcel(String filePath) {
        // Excel'den kullanÄ±cÄ±larÄ± yÃ¼kleme
    }

    public void loadBooksFromExcel(String filePath) {
        // Excel'den kitaplarÄ± yÃ¼kleme
    }

    public void addUser(User user) {
        users.add(user);
        // Excel'e kullanÄ±cÄ±yÄ± ekleme
    }

    public void addBook(Book book) {
        books.add(book);
        // Excel'e kitabÄ± ekleme
    }

    // DiÄŸer kÃ¼tÃ¼phane iÅŸlevleri
}

//GUI ArayÃ¼zÃ¼
class LibraryGUI {
 private LibraryManager libraryManager;
 private JFrame frame;
 private JPanel mainPanel;
 private JTextArea outputArea;

 public LibraryGUI(LibraryManager libraryManager) {
     this.libraryManager = libraryManager;
     frame = new JFrame("Library Management System");
     frame.setSize(800, 600);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     mainPanel = new JPanel();
     mainPanel.setLayout(new BorderLayout());

     JButton btnLogin = new JButton("Login");
     JButton btnRegister = new JButton("Register New User");
     JButton btnAddBook = new JButton("Add Book");
     JButton btnUpdateBook = new JButton("Update Book");
     JButton btnDeleteBook = new JButton("Delete Book");
     JButton btnAddMember = new JButton("Add Member");
     JButton btnUpdateMember = new JButton("Update Member");
     JButton btnDeleteMember = new JButton("Delete Member");
     JButton btnBorrowBook = new JButton("Borrow Book");
     JButton btnReturnBook = new JButton("Return Book");
     JButton btnSearchBook = new JButton("Search Book");
     JButton btnFilterBooks = new JButton("Filter Books");
     JButton btnGenerateReport = new JButton("Generate Report");

     JPanel buttonsPanel = new JPanel();
     buttonsPanel.setLayout(new GridLayout(4, 4, 5, 5));
     buttonsPanel.add(btnLogin);
     buttonsPanel.add(btnRegister);
     buttonsPanel.add(btnAddBook);
     buttonsPanel.add(btnUpdateBook);
     buttonsPanel.add(btnDeleteBook);
     buttonsPanel.add(btnAddMember);
     buttonsPanel.add(btnUpdateMember);
     buttonsPanel.add(btnDeleteMember);
     buttonsPanel.add(btnBorrowBook);
     buttonsPanel.add(btnReturnBook);
     buttonsPanel.add(btnSearchBook);
     buttonsPanel.add(btnFilterBooks);
     buttonsPanel.add(btnGenerateReport);

     outputArea = new JTextArea();
     JScrollPane scrollPane = new JScrollPane(outputArea);

     mainPanel.add(buttonsPanel, BorderLayout.NORTH);
     mainPanel.add(scrollPane, BorderLayout.CENTER);

     frame.add(mainPanel);
     frame.setVisible(true);

     // Button listeners
     btnLogin.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             // Implement login functionality
             outputArea.append("Login button clicked\n");
         }
     });

     btnRegister.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             // Implement register new user functionality
             outputArea.append("Register button clicked\n");
         }
     });

     // Add listeners for other buttons similarly
 }

 // Other GUI methods for displaying user information, book information, borrowing/returning books, etc.

 

// Ana uygulama sÄ±nÄ±fÄ±
public class KutuphaneYonetimSistemi {
    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();
        
        // GUI baÅŸlatma iÅŸlemi
        LibraryGUI libraryGUI = new LibraryGUI(libraryManager);
       
    }
}
}
