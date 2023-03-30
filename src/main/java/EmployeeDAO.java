public interface EmployeeDAO {
    Employee readByID(int id);

    List<Employee> readALl();
    void updateAge(Employee employee);

    void delete(Employee employee);
    Employee read(int id);
}
