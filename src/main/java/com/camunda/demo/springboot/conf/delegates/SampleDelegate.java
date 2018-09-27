package com.camunda.demo.springboot.conf.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

/**
 * Write a summarising sentence of this class first. Explain its responsibility afterwards. Don't explain how it works,
 * but rather what its purpose is. You may want to give usage examples, if helpful.
 * <p/>
 * TODO(KJAWOREK) Write sensible documentation for this class.
 * <p/>
 */
@Component
public class SampleDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("Spring Bean invoked.");

    }
}
