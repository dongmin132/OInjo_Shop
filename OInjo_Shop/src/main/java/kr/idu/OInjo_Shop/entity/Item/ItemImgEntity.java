package kr.idu.OInjo_Shop.entity.Item;

import kr.idu.OInjo_Shop.entity.BaseEntity;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "item_img")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemImgEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_img_id")
    private Long itemImgId;

    @Column(nullable = false)
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private ItemEntity item;
}