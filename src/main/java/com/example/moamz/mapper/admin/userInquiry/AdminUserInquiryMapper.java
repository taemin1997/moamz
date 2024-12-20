package com.example.moamz.mapper.admin.userInquiry;

import com.example.moamz.domain.dto.admin.AdminCommentDTO;
import com.example.moamz.domain.dto.admin.userInquiry.AdminUserInquiryDetailDTO;
import com.example.moamz.domain.dto.admin.userInquiry.AdminUserInquiryListDTO;
import com.example.moamz.domain.dto.page.Criteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface AdminUserInquiryMapper {
    //일반회원  문의목록 보여주기
    List<AdminUserInquiryListDTO> selectInquiryList ();

//    //일반회원 답변완료한 문의목록 보여주기
//    List<AdminUserInquiryListDTO> selectAnsweredInquiryList();

    //일반회원 특정 문의글 상세보기
    Optional<AdminUserInquiryDetailDTO> selectUserInquiryDetailById(@Param("fgPostId") Long fgPostId);

    //일반회원 특정 문의글 상세보기에 있는 댓글 보기
    Optional<AdminCommentDTO> selectUserInquiryDetailCommentById(@Param("fgPostId") Long fgPostId);


    // 일반회원 답변상태 변경시키기
    void changeStatusBtn(@Param("fgPostId") Long fgPostId);

    // 일반회원 문의글 총 갯수 조회
    int selectUserInquiryTotal();

    // 모든 일반회원 문의 페이지 목록 보기
    List<AdminUserInquiryListDTO> selectAllUserInquiryPage(Criteria criteria);

}
