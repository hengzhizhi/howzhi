package com.zua.howzhi.service;

        import com.zua.howzhi.mapper.CatalogueMapper;
        import com.zua.howzhi.mapper.CategoryMapper;
        import com.zua.howzhi.model.Catalogue;
        import com.zua.howzhi.model.Category;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;

/**
 * @Description 目录service
 * @Author Hengzhi
 * @Create 2020-03-22 11:09
 */
@Service
public class CatalogueServiceImpl implements CatalogueService {
    @Autowired
    private CatalogueMapper mapper;

    @Override
    public Catalogue selectById(Integer catalogueId) {
        return mapper.selectByPrimaryKey(catalogueId);
    }

    @Override
    public List<Catalogue> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public void delete(Integer catalogueId) {
        mapper.deleteByPrimaryKey(catalogueId);
    }

    @Override
    public List<Catalogue> selectByCourse(Integer courseId) {
        return mapper.selectByCourse(courseId);
    }
}
