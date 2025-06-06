const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm4415d/",
            name: "ssm4415d",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm4415d/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "校园资讯平台微信小程序"
        } 
    }
}
export default base
