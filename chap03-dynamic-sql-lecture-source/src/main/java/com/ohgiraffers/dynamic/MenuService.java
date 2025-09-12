package com.ohgiraffers.dynamic;

import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

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

    public void searchMenu(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();

        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.searchMenu(searchCriteria);
        menus.forEach(System.out::println);

        sqlSession.close();
    }

    public void searchMenuBySuperCategory(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper =
                sqlSession.getMapper(MenuMapper.class);

        List<MenuDTO> menus = mapper.searchMenuBySuperCategory(searchCriteria);
        menus.forEach(System.out::println);

        sqlSession.close();
    }

    public void searchMenuByRandomMenuCode(List<Integer> integers) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper =
                sqlSession.getMapper(MenuMapper.class);

        /* 설명. List 형태로 기본적으로는 넘기지 않지만 foreach를 활용하는 동적쿼리는 list활용 가능(feat. key값 불필요) */
        List<MenuDTO> menus = mapper.searchMenuByRandomMenuCode(integers);
        menus.forEach(System.out::println);

        sqlSession.close();
    }

    public void searchMenuByCodeOrSearchAll(SearchCriteria searchCriteria) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper =
                sqlSession.getMapper(MenuMapper.class);

        /* 설명. List 형태로 기본적으로는 넘기지 않지만 foreach를 활용하는 동적쿼리는 list활용 가능(feat. key값 불필요) */
        List<MenuDTO> menus = mapper.searchMenuByCodeOrSearchAll(searchCriteria);
        menus.forEach(System.out::println);

        sqlSession.close();
    }

    public void searchMenuByNameOrCategory(Map<String, Object> criteria) {
        SqlSession sqlSession = getSqlSession();
        MenuMapper mapper =
                sqlSession.getMapper(MenuMapper.class);

        /* 설명. List 형태로 기본적으로는 넘기지 않지만 foreach를 활용하는 동적쿼리는 list활용 가능(feat. key값 불필요) */
        List<MenuDTO> menus = mapper.searchMenuByNameOrCategory(criteria);
        menus.forEach(System.out::println);

        sqlSession.close();
    }
}
