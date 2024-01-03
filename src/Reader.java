class Reader {
    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private String dateOfBirth;
    private Phone phone;


    public Reader(String fullName, int libraryCardNumber, String faculty, String dateOfBirth, Phone phone) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }


    public void takeBook(int numOfBooks) {
        System.out.println(fullName + " took " + numOfBooks + " books");
    }


    public void takeBook(String... bookTitles) {
        // Действия для обработки взятых книг по их названиям
        // (не реализовано )
    }

    // Перегруженный метод takeBook, принимает переменное количество объектов класса Book
    public void takeBook(Book... books) {
        // Действия для обработки взятых книг по объектам класса Book
        // (не реализовано )
    }


    public void returnBook(int numOfBooks) {
        System.out.println(fullName + " returned " + numOfBooks + " books");
    }


    public void returnBook(String... bookTitles) {
        // Действия для обработки возвращаемых книг по их названиям
        // (не реализовано )
    }


    public void returnBook(Book... books) {
        // Действия для обработки возвращаемых книг по объектам класса Book
        // (не реализовано
    }
}