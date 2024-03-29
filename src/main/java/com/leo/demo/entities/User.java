package com.leo.demo.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author Leo Liu
 * @create 16/09/2019
 */
@Getter
@Setter
@Entity
@Table(name = "t_user")
public class User extends CommonEntity {
  private static final long serialVersionUID = 4244179798030072337L;
  private String name;
  private String gender;
  private Integer age;
  @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name = "address_id")
  private Address address;
}
