@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int city_id;
    @Column(name = "city_name")
    private String city_name;

    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true, mappedBy = "city")
    private Set<Employee> employees;

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }


    public int getCity_id() {
        return city_id;
    }
}
