import Java.util.concurrent.TimeUnit;

/**
what does this tokens represent: 
  Ex: Requests
  (Token Handling)
  What Happens to rejected tokens:
  What happens to allowed tokens
*/
Public class TokenBucketRateLimiter{
  private final long maxTokens;
  private final long availableTokens;
  private final long refillTimeInterval;
   private final TimeUnit refillUnitl;
  // Constructor
  public TokenBucketRateLimiter(long maxTokens,long refillInterval, TimeUnit refillUnit){
    this
  }

  /*
  left over tokens, after Consumption, are reflected synchronously.
  Consumption rate:
  Uniform : 1 token - 1 request,
  Non-Uniform : n-Token, m-request
  */
  public synchronized boolean tryConsume(long tokens){
    refill();
    if(tokens<=availableTokens){
      availableTokens -= tokens;
      return true;
    }
    // rejected request
    Queue.offer(request);
    return false;
  }

  /**
  new tokens are generated and adds to avialble tokens-> sum can't be more than max tokens
  Token generation rate, 
   whene evr requied?, after time frame,
  
  Addition Rate, 
  
  */
  private void refill(){
    long now = System.nanoTime();
    long elapsedTime = now - lastRefillTimestamp;
    long tokensToADD = (elapsedTime/refillUnit.toNanos(refillInterval))*maxTokens;
    if(tokensToAdd>0){
      availableTokens = Math.min(maxTokens, availableTokens+tokensToAdd);
      lastRefillTimestamp = now;
      //
      processQueue();
    }
  }
  private Void processQueue(){
    while(!requestQueue.isEmpty() && availableTokens >0){
    Runnable request = requestQueue.poll();
      if(tryConsume(1,request)){
        new Thread(request).start();
      }
    }
  }

  public static void main(String[] args){
    TokenBucketRateLimiter ratelimiter = new TokenBucketRateLimiter(10,1,TimeUnit.SECONDS);
    for(int i=0;i<20;i++){
      /**Runable separates task logic, parallel execution, from thread mngmnt.
       use for task that is short lived, 
      if task need to use return value don't use runnable, use callable
       for long running tasks: Executor Service
      for task that can be broken down to subtask: fork-join pool */
      Runnable request = () ->  System.out.println("Request"+i+"Allowed");
      if(rateLimiter.tryConsume(1)){
        System.out.println("Request"+i+"Allowed")
      }else{
      //Denied
      }
      try{
        Thread.sleep(100);
      } catch(InterruptedException e){
        Thread.currentThread().interrupt();
      }
    }
  }
}

P
