package harshal.temkar.payment_service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import harshal.temkar.payment_service.model.Payment;

public interface PaymentDao extends JpaRepository<Payment, String> {

}
