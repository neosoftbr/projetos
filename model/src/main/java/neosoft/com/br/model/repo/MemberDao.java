package neosoft.com.br.model.repo;

import java.util.List;

import neosoft.com.br.model.domain.Member;

public interface MemberDao
{
    public Member findById(Long id);

    public Member findByEmail(String email);

    public List<Member> findAllOrderedByName();

    public void register(Member member);
}
