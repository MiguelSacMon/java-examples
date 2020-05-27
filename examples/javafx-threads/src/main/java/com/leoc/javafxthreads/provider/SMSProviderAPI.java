package com.leoc.javafxthreads.provider;

public interface SMSProviderAPI {
    /**
     * Este método es para realizar recargas a servicios moviles pre-pagos
     * @param service
     * @param amount
     * @return
     */
    boolean recharge(String service, Integer amount);
}
