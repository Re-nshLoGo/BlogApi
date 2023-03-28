package com.reena.BlogApi.service;

import com.reena.BlogApi.dao.CommentRepo;
import com.reena.BlogApi.dao.PostRepo;
import com.reena.BlogApi.dao.UserRepo;
import com.reena.BlogApi.exception.ResourceNotFoundException;
import com.reena.BlogApi.exception.UsernotCreateThisPostException;
import com.reena.BlogApi.model.Comments;
import com.reena.BlogApi.model.Post;
import com.reena.BlogApi.model.Users;
import com.reena.BlogApi.payloads.CommentDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CommentService {
    @Autowired
    private CommentRepo commentRepo;
    @Autowired
    private PostRepo postRepo;
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

    public CommentDto addcomment(CommentDto commentDto, int userId, int postId) {
        Users user = userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User","user id",userId));
        Post post = postRepo.findById(postId).orElseThrow(()->new ResourceNotFoundException("Post","post id",postId));
        Comments comments = new Comments();
        comments.setContent(commentDto.getContent());
        comments.setPost(post);
        comments.setUser(user);
        Comments commentsnew = commentRepo.save(comments);
        return modelMapper.map(commentsnew,CommentDto.class);
    }

    public void deleteComment(int commentId,int userId, int postId) {
        Users user = userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User","user id",userId));
        Post post = postRepo.findById(postId).orElseThrow(()->new ResourceNotFoundException("Post","user id",userId));
        Comments comment = commentRepo.findById(commentId).orElseThrow(()->new ResourceNotFoundException("Comment","comment id",commentId));
        if(comment.getPost().getPostId() == postId && comment.getUser().getUserId() == userId){
            commentRepo.deleteById(commentId);
        }else {

            throw new UsernotCreateThisPostException(comment.getUser().getName(),comment.getPost().getPostId());
        }

    }
}
