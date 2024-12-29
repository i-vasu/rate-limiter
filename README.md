# rate-limiter
Design and Implement rate-limiter:
  Tocken Bucket, Leaky Bucket, Fixed Window, Sliding Window
  Key Parameters:
    1. Reject rate: Requests above rate limit are rejected
    2. Delay Rate : Request above rate limit are dealyed for furthur implementation
    3. Queue : Rejected Request were kept in a queue
    4. Priority Queue : Based on Urgency of request
  What it does?
    it limits the no.of requests from user in a specified timeframe, protecting for DoS/resorce efficiency, more traffic -> more drop rate -> adds latency.
  How to reduce latency?
    Keep decentralised/distributed rate-limiter, to handle spike or burst in traffic i.e, depends on traffic patterns
    Approach : Centralised DB, Distributed Cache(to Store rate-mititng data), RateLimiter-As-A-Service 
    
    
    
    
  

