package productsAbs;

import java.time.LocalDate;

public  abstract class Product {
    private int id;
    private String name;
    private  String company;
    private LocalDate date;

    public Product() {
    }

    public Product(int id,String name, String company, LocalDate date) {
        this.id=id;
        this.name = name;
        this.company = company;
        this.date = date;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", date=" + date +
                '}';
    }
}

