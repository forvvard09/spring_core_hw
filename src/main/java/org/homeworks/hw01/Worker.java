package org.homeworks.hw01;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Worker {
    private String name;


    public void goodsIn() {
        System.out.println(this.name + " Принимает товар!");
    }

    public void goodsBreak() {
        System.out.println(this.name + " Ломает товар!");
    }

}
