package com.ohgiraffers.section03.remix;

import org.apache.ibatis.annotations.*;

import java.util.List;

/* 설명. 쿼리를 포함한 Mapper용 인터페이스이자 DAO계층 역할도 한다. */
public interface MenuMapper {

    List<MenuDTO> selectAllMenus();

    MenuDTO selectMenuByMenuCode(int menuCode);

    int insertMenu(MenuDTO menu);

    int updateMenu(MenuDTO menu);

    int deleteMenu(int menuCode);
}
