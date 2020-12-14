package caf.backend.logic.model.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;

@Entity @Table(name = "blackcards")
@Getter
@Setter
@NoArgsConstructor
@ToString
@Data
public class Blackcard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @Column(name = "text", nullable = false)
    private String text;

    @Column(name = "childLike", nullable = false)
    private Boolean childLike;

    @Column(name = "creatorName", nullable = false)
    private String creatorName;

    @ManyToOne
    @JoinColumn( name = "set" )
    private Set set;

    public Blackcard(@JsonProperty("text") String text,
                     @JsonProperty("childLike") boolean childLike,
                     @JsonProperty("creatorName") String creatorName,
                     @JsonProperty("set") Set set )
    {
        this.text = text;
        this.childLike = childLike;
        this.creatorName = creatorName;
        this.set = set;
    }
}
