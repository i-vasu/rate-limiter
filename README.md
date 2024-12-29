# rate-limiter
## Design and Implement rate-limiter:
  1. Tocken Bucket, 2. Leaky Bucket, 3. Fixed Window, 4. Sliding Window
  ### Key Parameters:
    1. Reject rate: Requests above rate limit are rejected
    2. Delay Rate : Request above rate limit are dealyed for furthur implementation
    3. Queue : Rejected Request were kept in a queue
    4. Priority Queue : Based on Urgency of request
  ### Granularity:
    User, IP Address, Request/Service etc..
  ### What it does?
    it limits the no.of requests from user in a specified timeframe, protecting for DoS/resorce efficiency, more traffic -> more drop rate -> adds latency.
  ### How to reduce latency?
    Keep decentralised/distributed rate-limiter, to handle spike or burst in traffic i.e, depends on traffic patterns
  ### Approach
    1. Centralised DB, 
    2. Distributed Cache(to Store rate-mititng data), 
    3. RateLimiter-As-A-Service 
    
  ### Tocken Bucket
    TODO- When to use which, who is using what
  ### Leaky Bucket
  ### Fixed Window
  ### Sliding Window
    
    
  

