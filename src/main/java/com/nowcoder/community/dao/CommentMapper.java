package com.nowcoder.community.dao;

import com.nowcoder.community.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    //根据帖子类型和帖子id查到该帖子的所有评论
    List<Comment> selectCommentsByEntity(int entityType, int entityId, int offset, int limit);

    //根据帖子类型和帖子id查到该帖子的评论总数
    int selectCountByEntity(int entityType, int entityId);

    int insertComment(Comment comment);

    Comment selectCommentById(int id);
}
