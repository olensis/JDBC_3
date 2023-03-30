public class Employee {
    @Entity
    @Table(name = "employee_1")
    public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @Column(name = "first_name")
        private String first_name;
        @Column(name = "last_name")
        private String last_name;
        @Column(name = "gender")
        private String gender;
        @Column(name = "age")
        private int age;
        @Column(name = "city_id")
        private int city;

        public Employee() {
        }

        @ManyToOne()
        @JoinColumn(name = "city_id")
        private City city;

        public City getCity() {
            return city;
        }

            @Override

            public boolean equals (Object o){
                if (this == o)
                    return true;
                if (o == null || getClass() != o.getClass())


                return false;
            }
        }
    }
}
