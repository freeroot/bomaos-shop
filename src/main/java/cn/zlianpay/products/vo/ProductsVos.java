package cn.zlianpay.products.vo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class ProductsVos {

    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品名称
     */
    private String classifyName;

    /**
     * 卡密数量
     */
    private Integer cardMember;

    /**
     * 商品金额
     */
    private String price;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 商品链接
     */
    private String link;

    /**
     * 商品状态
     */
    private Integer status;

    /**
     * 商品详情
     */
    private String pdInfo;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 更新时间
     */
    private Date updatedAt;

    /**
     * 删除时间
     */
    private Date deletedAt;

    /**
     * 分类ID
     */
    private Integer classifyId;

    /**
     * 卡密数量
     */
    private String cardsCount;

    /**
     * 商品logo
     */
    private String imageLogo;

    /**
     * 批发功能
     */
    private Integer isWholesale;

    /**
     * 批发配置
     */
    private String wholesale;
}
