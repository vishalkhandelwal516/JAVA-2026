class Librarian extends Person {

    private int booksManaged; // getter
    private String speclz; // getter
    
    public Librarian(String name, String id, String department,int booksManaged, String speclz) {
        super(name, id, department);
        this.booksManaged = booksManaged;
        this.speclz = speclz;
    }
    
    public int getBooksManaged() {
        return booksManaged;
    }

    public String getSpecialization() {
        return speclz;
    }
    
    @Override
    public String getRole() {
        return "Librarian (" + speclz + ")";
    }

    @Override
    public String toString() {
        return super.toString() + " | Books managed: " + booksManaged +
               " | Specialization: " + speclz;
    }
}
