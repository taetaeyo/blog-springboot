const token = searchParam('token');

if (token) {
    local.setItem("access_token", token);
}

function searchParam(key) {
    return new URLSearchParams(location.search).get(key);
}