package ac.su.kiosk.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Long basePrice;

    @Column
    private String description;

    @Column(length = 2000)
    private String image;

    @ManyToOne
    @JoinColumn(name = "categoryId", nullable = false)
    private Category category;
}
