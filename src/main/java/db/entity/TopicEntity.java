package db.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "topics")
public class TopicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "topic_id")
    private Integer id;

    @Column(name = "title")
    private String title;
}
