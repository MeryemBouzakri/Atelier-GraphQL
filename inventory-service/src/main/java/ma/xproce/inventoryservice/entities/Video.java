package ma.xproce.inventoryservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@Entity @AllArgsConstructor @NoArgsConstructor @Builder

public class Video {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY )
    private Long id;

    private String name;
    private String description;
    private String url;
    private Date datePublication;
@ManyToOne
private Creator creator;
}
