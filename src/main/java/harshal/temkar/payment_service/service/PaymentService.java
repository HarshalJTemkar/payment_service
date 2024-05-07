package harshal.temkar.payment_service.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

import harshal.temkar.payment_service.dao.PaymentDao;
import harshal.temkar.payment_service.model.Payment;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Transactional
@Log4j2
@RequiredArgsConstructor
@CacheConfig(cacheNames = { "payment" })
public class PaymentService {

	private final PaymentDao paymentDao;
	
	public Payment processPayment(Payment payment) {
		log.info("PaymentService ==> processPayment ==> Start");
        return paymentDao.save(payment);
    }

    public Payment getPaymentById(String id) {
    	log.info("PaymentService ==> getPaymentById ==> Start");
        return paymentDao.findById(id).orElse(null);
    }
}
