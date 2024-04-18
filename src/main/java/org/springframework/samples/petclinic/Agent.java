
package org.springframework.samples.petclinic;

import dev.langchain4j.service.*;

public interface Agent {
 
//	String SYSTEM_PROMPT = "You are a customer support agent of a pet clinic. You will answer question from a petclinic customer.";

//	String SYSTEM_PROMPT = "You are an internal tech support agent of a pet clinic. You will answer question from a customer service agent.";

	String SYSTEM_PROMPT = "You are an internal tech support agent of a pet clinic. You will answer question from a customer service agent.";

	@SystemMessage(SYSTEM_PROMPT)
	String chat(@UserMessage String message);
}
