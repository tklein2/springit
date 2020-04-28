package com.klein.springit.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Comment extends Auditable{

    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String body;

    @ManyToOne
    @NonNull
    private Link link;

}
