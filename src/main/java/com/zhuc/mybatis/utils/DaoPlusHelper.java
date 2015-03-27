package com.zhuc.mybatis.utils;

import static com.zhuc.mybatis.utils.ResourceDef.PAGE_SIZE;
import static com.zhuc.mybatis.utils.ResourceDef.PAGE_SORT_TYPE_DESC;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

/**
 * Created by ZHUC on 2015/3/23.
 */
public class DaoPlusHelper {

    public static PageRequest build(RequestBean bean){
        PageRequest page = null;

        if (bean != null) {
            int pageNumber = bean.getPageNumber();

            pageNumber = pageNumber < 1 ? 1 : pageNumber;

            String sortType = bean.getSortType();
            String sortName = bean.getSortName();

            Sort sort = null;
            if (StringUtils.isNotBlank(sortName)) {
                if (PAGE_SORT_TYPE_DESC.equalsIgnoreCase(sortType)) {
                    sort = new Sort(Direction.DESC, sortName);
                } else {
                    sort = new Sort(Direction.ASC, sortName);
                }
            }

            if (sort != null) {
                page = new PageRequest(pageNumber - 1, PAGE_SIZE, sort);
            } else {
                page = new PageRequest(pageNumber - 1, PAGE_SIZE);
            }

        }

        return page;
    }

}
