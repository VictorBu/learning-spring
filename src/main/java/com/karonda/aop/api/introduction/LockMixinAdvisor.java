package com.karonda.aop.api.introduction;

import org.springframework.aop.support.DefaultIntroductionAdvisor;

public class LockMixinAdvisor extends DefaultIntroductionAdvisor {

	public LockMixinAdvisor() {
        super(new LockMixin(), Lockable.class);
    }
}
