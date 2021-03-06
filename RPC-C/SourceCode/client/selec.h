/*
 * Please do not edit this file.
 * It was generated using rpcgen.
 */

#ifndef _SELEC_H_RPCGEN
#define _SELEC_H_RPCGEN

#include <rpc/rpc.h>

#include <pthread.h>

#ifdef __cplusplus
extern "C" {
#endif


struct list {
	char *str;
	char *strr;
};
typedef struct list list;

struct listt {
	char *st;
};
typedef struct listt listt;

#define SELPROG 300
#define SELVER 1

#if defined(__STDC__) || defined(__cplusplus)
#define fil 1
extern  enum clnt_stat fil_1(void *, char **, CLIENT *);
extern  bool_t fil_1_svc(void *, char **, struct svc_req *);
#define rev 2
extern  enum clnt_stat rev_1(listt *, char **, CLIENT *);
extern  bool_t rev_1_svc(listt *, char **, struct svc_req *);
#define enc 3
extern  enum clnt_stat enc_1(listt *, char **, CLIENT *);
extern  bool_t enc_1_svc(listt *, char **, struct svc_req *);
#define del 4
extern  enum clnt_stat del_1(listt *, char **, CLIENT *);
extern  bool_t del_1_svc(listt *, char **, struct svc_req *);
#define conc 5
extern  enum clnt_stat conc_1(list *, char **, CLIENT *);
extern  bool_t conc_1_svc(list *, char **, struct svc_req *);
extern int selprog_1_freeresult (SVCXPRT *, xdrproc_t, caddr_t);

#else /* K&R C */
#define fil 1
extern  enum clnt_stat fil_1();
extern  bool_t fil_1_svc();
#define rev 2
extern  enum clnt_stat rev_1();
extern  bool_t rev_1_svc();
#define enc 3
extern  enum clnt_stat enc_1();
extern  bool_t enc_1_svc();
#define del 4
extern  enum clnt_stat del_1();
extern  bool_t del_1_svc();
#define conc 5
extern  enum clnt_stat conc_1();
extern  bool_t conc_1_svc();
extern int selprog_1_freeresult ();
#endif /* K&R C */

/* the xdr functions */

#if defined(__STDC__) || defined(__cplusplus)
extern  bool_t xdr_list (XDR *, list*);
extern  bool_t xdr_listt (XDR *, listt*);

#else /* K&R C */
extern bool_t xdr_list ();
extern bool_t xdr_listt ();

#endif /* K&R C */

#ifdef __cplusplus
}
#endif

#endif /* !_SELEC_H_RPCGEN */
