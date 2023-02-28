package hellojpa.domain;

import javax.persistence.*;

@Entity
public class Member extends BaseEntity{
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String city;
    private String street;
    private String zipcode;

    @OneToOne
    @JoinColumn(name = "locker_id")
    private Locker locker;

}
