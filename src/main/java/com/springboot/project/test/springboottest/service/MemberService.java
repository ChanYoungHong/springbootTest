package com.springboot.project.test.springboottest.service;

import com.springboot.project.test.springboottest.domain.Member;
import com.springboot.project.test.springboottest.repository.MemberRepository;
import com.springboot.project.test.springboottest.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();


    public long join(Member member) {
        // 같은 이름이 있는 중복 회원은 안 된다.
        validateDuplicateMember(member);

        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                throw new IllegalStateException("이미 존재하는 회원입니다");
                });
    }

    public List<Member> findMembers() {



        return null;
    }
}
