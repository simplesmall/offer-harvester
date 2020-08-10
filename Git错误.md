RPC failed; curl 56 OpenSSL SSL_read: SSL_ERROR_SYSCALL, errno 10054



env GIT_SSL_NO_VERIFY=true git clone https://<host_name/git/project.git



git config http.sslVerify "false"