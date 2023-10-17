package com.tmb.model.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Task {

    @Id
    @GeneratedValue(generator = "seq_tbl_task", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "seq_tbl_task", sequenceName = "seq_tbl_task")
    @Column(name = "pk_long_id")
    private Long id;

    @Column(name = "tasks_txt_name")
    private String name;

    @Column(name = "tasks_txt_description")
    private String description;

    @Column(name = "tasks_dt_datedue")
    private Date dateDue;

    @Column(name = "task_bl_past")
    private Boolean isPast;
}
