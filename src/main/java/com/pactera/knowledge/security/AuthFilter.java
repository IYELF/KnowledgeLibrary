package com.pactera.knowledge.security;

import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class AuthFilter extends UsernamePasswordAuthenticationFilter {

//    @Autowired
//    private IUserService userService;
//
//    @Autowired
//    private ISmsService smsService;
//
//    @Override
//    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
//            throws AuthenticationException {
//        String name = obtainUsername(request);
//        if (!Strings.isNullOrEmpty(name)) {
//            request.setAttribute("username", name);
//            return super.attemptAuthentication(request, response);
//        }
//
//        String telephone = request.getParameter("telephone");
//        if (Strings.isNullOrEmpty(telephone) || !LoginUserUtil.checkTelephone(telephone)) {
//            throw new BadCredentialsException("Wrong telephone number");
//        }
//
//        User user = userService.findUserByTelephone(telephone);
//        String inputCode = request.getParameter("smsCode");
//        String sessionCode = smsService.getSmsCode(telephone);
//        if (Objects.equals(inputCode, sessionCode)) {
//            if (user == null) { // 如果用户第一次用手机登录 则自动注册该用户
//                user = userService.addUserByPhone(telephone);
//            }
//            return new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
//        } else {
//            throw new BadCredentialsException("smsCodeError");
//        }
//    }
}
