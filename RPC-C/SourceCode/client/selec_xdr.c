/*
 * Please do not edit this file.
 * It was generated using rpcgen.
 */

#include "selec.h"

bool_t
xdr_list (XDR *xdrs, list *objp)
{
	register int32_t *buf;

	 if (!xdr_string (xdrs, &objp->str, ~0))
		 return FALSE;
	 if (!xdr_string (xdrs, &objp->strr, ~0))
		 return FALSE;
	return TRUE;
}

bool_t
xdr_listt (XDR *xdrs, listt *objp)
{
	register int32_t *buf;

	 if (!xdr_string (xdrs, &objp->st, ~0))
		 return FALSE;
	return TRUE;
}