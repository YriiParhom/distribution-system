package ru.parhom.distributionsystem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
// TODO: 18.06.2023 зачем тут @Data?
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dormitory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // TODO: 18.06.2023 советую разделять поля в объектах-сущностях (энтити, дто) пустыми строками, чтобы не сливалось
    // TODO: 18.06.2023 я не сторонник валидаий на уровне энтити, хоть это и допустимо. Поидее, мы должны доверять домену.
    //  Валидаии лучше делать на уровне ДТО (реквесты, если речь идет о ресте)
    @Min(1)
    private Integer number;
    // TODO: 18.06.2023 of - самый бесполезный предлог. roomNum, roomAmount - это все лаконичнее и имеет тот же смысл
    private Integer numOfRooms;
    @ManyToOne
    // TODO: 18.06.2023 fyi: еще одной принятой формой может быть именование вида fk_university
    @JoinColumn(name = "university_id")
    private University university;
    private boolean isEnable;
    // TODO: 18.06.2023 не советую увлекаться каскадами. Может сыграть злую шутку
    @OneToMany(cascade = CascadeType.ALL)
    // TODO: 18.06.2023 советую ограничить сеттеры для О2М полей
    @JoinColumn(name = "dormitory_id")
    private Set<Room> rooms = new HashSet<>();
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "dormitory_id")
    private Set<Student> students = new HashSet<>();
}
