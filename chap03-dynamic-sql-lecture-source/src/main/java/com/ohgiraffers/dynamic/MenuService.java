package com.ohgiraffers.dynamic;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.dynamic.Template.getSqlSession;

public class MenuService {
    public void findMenuByPrice(int maxPrice) {
        SqlSession sqlSession = getSqlSession();
//        System.out.println("sqlSession = " + sqlSession);

        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menu = mapper.selectMenuByPrice(maxPrice);
        menu.forEach(System.out::println);

        sqlSession.close();
    }

    public void searchmenu(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();

        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.searchMenu(searchCriteria);
        menus.forEach(System.out::println);

        sqlSession.close();
    }
}
