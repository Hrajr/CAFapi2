package caf.backend.logic.model.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;

@Entity @Table(name = "set")
@Getter
@Setter
@NoArgsConstructor
@ToString
@Data
public class Set {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @Column(name = "text", nullable = false)
    private String text;

    public Set(@JsonProperty("text") String text )
    {
        this.text = text;
    }
}
