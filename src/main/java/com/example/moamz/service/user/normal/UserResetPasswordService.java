package com.example.moamz.service.user.normal;

import com.example.moamz.domain.dto.user.normal.UserResetPasswordDTO;
import com.example.moamz.mapper.user.normal.UserResetPasswordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserResetPasswordService {
    @Autowired
    private UserResetPasswordMapper userResetPasswordMapper;

    // 비밀번호 조회 및 변경
    @Transactional
    public boolean resetPassword(String fgUserId, String fgNormalPhone, UserResetPasswordDTO userResetPasswordDTO) {
        // 사용자 정보 조회
        Optional<String> existingPassword = userResetPasswordMapper.selectPassword(fgUserId, fgNormalPhone);

        // 비밀번호 정보가 없으면 리턴 false (잘못된 정보)
        if (!existingPassword.isPresent()) {
            return false;
        }

        // 비밀번호 변경
        int updateCount = userResetPasswordMapper.updatePassword(userResetPasswordDTO);

        // 업데이트된 행 수가 1보다 크면 성공, 아니면 실패
        return updateCount > 0;
    }
}
