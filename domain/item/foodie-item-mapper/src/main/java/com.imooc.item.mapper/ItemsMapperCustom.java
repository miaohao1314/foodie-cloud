package com.imooc.item.mapper;

import com.imooc.item.pojo.vo.ItemCommentVO;
import com.imooc.item.pojo.vo.ShopcartVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
/**
 * 商品模块mapper微服务改造
 */
public interface ItemsMapperCustom {

    public List<ItemCommentVO> queryItemComments(@Param("paramsMap") Map<String, Object> map);

    // TODO 迁移到foodie-search模块
//    public List<SearchItemsVO> searchItems(@Param("paramsMap") Map<String, Object> map);
//
//    public List<SearchItemsVO> searchItemsByThirdCat(@Param("paramsMap") Map<String, Object> map);

    public List<ShopcartVO> queryItemsBySpecIds(@Param("paramsList") List specIdsList);

    public int decreaseItemSpecStock(@Param("specId") String specId,
                                     @Param("pendingCounts") int pendingCounts);
}