package com.flower.dao;

import com.flower.bean.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Mapper
@Component
public interface CommentDao {
    List<Comment> findCommentAll();

    List<Comment> findCommentByCondition(Map map);

    List<Comment> findCommentByIds(List list);

    int insertComment(Map map);

    int insertComments(List<Comment> Comments);

    int updateComment(Map map);

    int updateComments(List<Comment> Comments);

    int deleteCommentById(int id);

    int deleteCommentByIds(List ids);
}
