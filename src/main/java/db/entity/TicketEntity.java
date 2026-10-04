package db.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tickets")
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private Long ticketId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @Column(name = "chat_id")
    private UserEntity chatId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "topic_id")
    private TopicEntity topic;

    @Column(name = "description")
    private String description;
}
