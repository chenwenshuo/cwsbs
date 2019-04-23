package com.cws.mapper;

import com.cws.entity.DocFile;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DocFileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DocFile record);

    DocFile selectByPrimaryKey(Integer id);

    List<DocFile> selectAll();

    int updateByPrimaryKey(DocFile record);
    
    DocFile selectByFileKey(@Param("fileKey") String fileKey);
}