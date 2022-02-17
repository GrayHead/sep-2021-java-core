package lessons.lesson2.demo2;


class Customer extends User {
    private String password;

    public Customer() {

    }

    public Customer(int id, String name, String password) {
        super(id, name);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Customer customer = (Customer) o;

        return password != null ? password.equals(customer.password) : customer.password == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "password='" + password + '\'' +
                "} " + super.toString();
    }

//    @Override
//    public void greeting() {
//        System.out.println("hi");
//    }
}
