# elastic-stack-liferay
Demo integration of Liferay with the Elastic Stack, such that Liferay's live user count is stored as a metric in Elasticsearch.

This project consists of a Liferay service builder web service that exposes the live user count. For this service to work, the following setting needs to be applied to Liferay:
```
live.users.enabled=true
```

The Logstash configuration uses the http_poller input to poll the Liferay service endpoint every x seconds and write the user count to a daily index named liferay-YYYY.MM.dd
