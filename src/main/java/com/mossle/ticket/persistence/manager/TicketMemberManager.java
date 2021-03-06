package com.mossle.ticket.persistence.manager;

import com.mossle.core.hibernate.HibernateEntityDao;

import com.mossle.ticket.persistence.domain.TicketMember;

import org.springframework.stereotype.Service;

@Service
public class TicketMemberManager extends HibernateEntityDao<TicketMember> {
}
