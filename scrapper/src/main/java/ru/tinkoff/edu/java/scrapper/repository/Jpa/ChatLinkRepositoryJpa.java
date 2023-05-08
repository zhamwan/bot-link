package ru.tinkoff.edu.java.scrapper.repository.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.tinkoff.edu.java.scrapper.Model.Jpa.ChatJpa;
import ru.tinkoff.edu.java.scrapper.Model.Jpa.ChatLinkJpa;
import ru.tinkoff.edu.java.scrapper.Model.Jpa.LinkJpa;


import java.util.List;

@Repository
public interface ChatLinkRepositoryJpa extends JpaRepository<ChatLinkJpa, Long> {

    @Query(value ="delete from chat_link where link_id = :id")
    void removeByLinkId(Long id);

    @Query(value ="delete from chat_link where chat_id = :id")
    void removeByChatId(Long id);

    @Query(value ="select * from chat_link inner join link on chat_link.link_id = link.id" +
            " where chat_link.link_id = :id")
    List<LinkJpa> findAllLinkByChatId(Long id);

    @Query(value ="select * from chat_link inner join chat on chat_link.chat_id = chat.id" +
            " where chat_link.link_id = :id")
    List<ChatJpa> findAllChatByLinkId(Long id);


}
